package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venue {

    private Location location;
    private String title;
    private String address;
    private String foursquareId;
    private String foursquareType;
    private String googlePlaceId;
    private String googlePlaceType;

    public Venue(Location location, String title, String address) {
        this.location = location;
        this.title = title;
        this.address = address;
    }

}
