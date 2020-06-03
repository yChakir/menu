package ma.tiwtiw.menu.controller;

import ma.tiwtiw.core.controller.impl.BaseRestController;
import ma.tiwtiw.menu.dto.MenuDto;
import ma.tiwtiw.menu.model.Menu;
import ma.tiwtiw.menu.service.MenuService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menus")
public class MenuController extends BaseRestController<Menu, MenuDto, String, MenuService> {

  private final MenuService menuService;

  private final ModelMapper modelMapper;

  public MenuController(MenuService menuService, ModelMapper modelMapper) {
    super(Menu.class, MenuDto.class);
    this.menuService = menuService;
    this.modelMapper = modelMapper;
  }

  @Override
  protected MenuService getService() {
    return menuService;
  }

  @Override
  protected ModelMapper getMapper() {
    return modelMapper;
  }

}
