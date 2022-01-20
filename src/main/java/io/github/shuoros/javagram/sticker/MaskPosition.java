package io.github.shuoros.javagram.sticker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaskPosition {

    private String point;
    private float xShift;
    private float yShift;
    private float scale;

}
