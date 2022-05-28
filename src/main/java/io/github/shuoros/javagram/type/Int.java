package io.github.shuoros.javagram.type;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Getter
public class Int implements Type {

    private int value;

    public Int(int value) {
        this.value = value;
    }

}
