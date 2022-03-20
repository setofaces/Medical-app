package liga.medical.mapper;

import java.util.List;

public interface MapStructMapper<MODEL, DTO> {
    DTO modelToDto(MODEL model);

    MODEL dtoToModel(DTO dto);

    List<DTO> modelListToDtoList(List<MODEL> modelList);

    List<MODEL> dtoListToModelList(List<DTO> dtoList);
}
