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
  private MenuIconTypeEnum type = MenuIconTypeEnum.icon;

  private String value;

  private MenuIconThemeEnum theme;

  @Default
  private Boolean spin = Boolean.TRUE;

  private String twoToneColor;

  private String iconfont;

}