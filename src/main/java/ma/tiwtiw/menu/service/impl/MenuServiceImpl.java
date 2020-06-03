package ma.tiwtiw.menu.service.impl;

import lombok.RequiredArgsConstructor;
import ma.tiwtiw.menu.repository.MenuRepository;
import ma.tiwtiw.menu.service.MenuService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

  private final MenuRepository menuRepository;

  @Override
  public MenuRepository getRepository() {
    return menuRepository;
  }
}
