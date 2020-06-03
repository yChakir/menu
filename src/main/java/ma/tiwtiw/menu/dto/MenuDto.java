package ma.tiwtiw.menu.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.dto.BaseDto;
import ma.tiwtiw.menu.model.Menu;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MenuDto extends BaseDto<Menu, String> {

  private String text;

  private String i18n;

  private Boolean group;

  private String link;

  private String externalLink;

  private String target;

  private MenuIconDTO icon;
  private String iconValue;

  private Long badge;

  private Boolean badgeDot;

  private String badgeStatus;

  private Boolean disabled;

  private Boolean hideInBreadcrumb;

  private List<String> acl;

  private Boolean shortcut;

  private Boolean shortcutRoot;

  private Boolean reuse;

  private Boolean open;

  private String key;

  private List<MenuDto> children;
}
