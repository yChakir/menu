package ma.tiwtiw.menu.service.impl;

import ma.tiwtiw.core.service.impl.BaseMongoTemplateServiceImpl;
import ma.tiwtiw.menu.model.Menu;
import ma.tiwtiw.menu.service.MenuService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends BaseMongoTemplateServiceImpl<Menu, String> implements
    MenuService {

  private final MongoTemplate mongoTemplate;

  public MenuServiceImpl(MongoTemplate mongoTemplate) {
    super(Menu.class);
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  protected MongoTemplate getMongoTemplate() {
    return mongoTemplate;
  }
}
