package bachtiar.firdaus.spring_design_pattern_creational.factory.method;

import lombok.Getter;

public class TikTokSocialMedia implements SocialMedia{

    @Getter
    private final String name = "TIKTOK";

    @Getter
    private final String link = "https://tiktok.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.TIKTOK;

}