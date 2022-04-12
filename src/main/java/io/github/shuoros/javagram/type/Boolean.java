package io.github.shuoros.javagram.type;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Getter
public class Boolean implements Type {

    private boolean value;

}
