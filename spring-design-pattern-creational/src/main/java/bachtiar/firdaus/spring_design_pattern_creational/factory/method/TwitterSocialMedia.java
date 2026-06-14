package bachtiar.firdaus.spring_design_pattern_creational.factory.method;

import lombok.Getter;

public class TwitterSocialMedia implements SocialMedia{

    @Getter
    private final String name = "TWITTER";

    @Getter
    private final String link = "https://twitter.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.TWITTER;

}