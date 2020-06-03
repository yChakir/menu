package ma.tiwtiw.menu.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.model.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseModel<String> {

  private String text;

  private String i18n;

  @Default
  private Boolean group = Boolean.TRUE;

  private String link;

  private String externalLink;

  private LinkTargetEnum target;

  private MenuIcon icon;

  private Long badge;

  @Default
  private Boolean badgeDot = Boolean.FALSE;

  private String badgeStatus;

  @Default
  private Boolean disabled = Boolean.FALSE;

  private Boolean hideInBreadcrumb;

  @Default
  private List<String> acl = new ArrayList<>();

  private Boolean shortcut;

  private Boolean shortcutRoot;

  private Boolean reuse;

  private Boolean open;

  private Long order;

  @Default
  private List<Menu> children = new ArrayList<>();

}
