package service;

import java.util.List;

public interface AbstractService<MODEL, DTO> {
    DTO findById(Long id);

    void addOrUpdate(DTO dto);

    List<DTO> getAll();

    void deleteById(Long id);
}
