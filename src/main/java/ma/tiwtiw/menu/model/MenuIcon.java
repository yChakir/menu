package ma.tiwtiw.menu.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuIcon {

  private MenuIconTypeEnum type = MenuIconTypeEnum.ICON;

  private String value;

  private MenuIconThemeEnum theme = MenuIconThemeEnum.OUTLINE;

  private Boolean spin = Boolean.FALSE;

  private String twoToneColor;

  private String iconfont;

}