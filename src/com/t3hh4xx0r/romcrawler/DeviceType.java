package com.t3hh4xx0r.romcrawler;

public enum DeviceType {
	   TORO("http://rootzwiki.com/forum/362-cdma-galaxy-nexus-developer-forum");
	   VIGOR("http://rootzwiki.com/forum/267-rezound-developer-forum/");

	    private final String forumUrl;

	    private DeviceType(String forumUrl) {
	        this.forumUrl = forumUrl;
	    }

	    public String getForumUrl() {
	        return forumUrl;
	    }
}
