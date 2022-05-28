package io.github.shuoros.javagram.type;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Getter
public class Bool implements Type {

    private boolean value;

    public Bool(boolean value) {
        this.value = value;
    }

}
