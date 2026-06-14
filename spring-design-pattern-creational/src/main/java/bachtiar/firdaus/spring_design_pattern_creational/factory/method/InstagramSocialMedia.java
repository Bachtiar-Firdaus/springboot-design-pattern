package bachtiar.firdaus.spring_design_pattern_creational.factory.method;

import lombok.Getter;

public class InstagramSocialMedia implements SocialMedia{

    @Getter
    private final String name = "INSTAGRAM";

    @Getter
    private final String link = "https://instagram.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;

}