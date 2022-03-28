package liga.medical.config;

import liga.medical.model.PersonData;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            Long medicalCardId = ((PersonData) authentication.getPrincipal()).getMedicalCardId();
            response.sendRedirect("/medical_card/" + medicalCardId);
        } else if (roles.contains("ROLE_PATIENT")) {
            Long id = ((PersonData) authentication.getPrincipal()).getId();
            response.sendRedirect("/person_data/" + id);
        }
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
