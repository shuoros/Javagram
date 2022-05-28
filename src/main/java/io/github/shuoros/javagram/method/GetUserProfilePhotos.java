package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Type;
import io.github.shuoros.javagram.type.UserProfilePhotos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetUserProfilePhotos implements Method {

    private final String REQUEST = "/getUserProfilePhotos";
    private int chatId;
    private int offset;
    private int limit;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new UserProfilePhotos();
    }

    public GetUserProfilePhotos(int chatId) {
        this.chatId = chatId;
    }

}
