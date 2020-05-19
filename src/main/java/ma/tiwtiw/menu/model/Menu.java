package ma.tiwtiw.menu.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Menu {

  @Id
  private String id;

  private String text;

  private String i18n;

  private Boolean group = Boolean.TRUE;

  private String link;

  private String externalLink;

  private LinkTargetEnum target;

  private MenuIcon icon;

}
