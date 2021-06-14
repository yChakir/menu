package ma.tiwtiw.menu.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuIcon {

  @Default
  private MenuIconTypeEnum type = MenuIconTypeEnum.ICON;

  private String value;

  @Default
  private MenuIconThemeEnum theme = MenuIconThemeEnum.OUTLINE;

  @Default
  private Boolean spin = Boolean.FALSE;

  private String twoToneColor;

  private String iconfont;

}