package liga.medical.logging;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.model.LogEntity;
import liga.medical.repository.LogRepository;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@Slf4j
public class LoggingAdvice {

    private final LogRepository logRepository;

    public LoggingAdvice(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Pointcut("@annotation(liga.medical.logging.Loggable)")
    public void loggableMethod() {}

    @Pointcut("within(@liga.medical.logging.Loggable *)")
    public void loggableClass() {}

    @Around("loggableMethod() || loggableClass()")
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {

        String className = pjp.getTarget().getClass().toString();
        String methodName = pjp.getSignature().getName();
        Object[] array = pjp.getArgs();
        LogEntity logEntity = new LogEntity();
        logEntity.setEventDate(LocalDateTime.now());
        logEntity.setMethodName(methodName);
        logEntity.setClassName(className);
        logEntity.setUserName(SecurityContext.class.getName());//???
        logRepository.add(logEntity);
        log.info("Вызван метод: " + className + ":" + methodName + " ()" + " с аргументами" + array.toString());

        return pjp.proceed();
    }


}
