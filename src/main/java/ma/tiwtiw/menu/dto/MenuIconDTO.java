package ma.tiwtiw.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuIconDTO {

  private String type;

  private String value;

  private String theme;

  private Boolean spin;

  private String twoToneColor;

  private String iconfont;
}
