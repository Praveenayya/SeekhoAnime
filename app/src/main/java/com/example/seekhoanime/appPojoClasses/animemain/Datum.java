
package com.example.seekhoanime.appPojoClasses.animemain;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("trailer")
    @Expose
    private Trailer trailer;
    @SerializedName("approved")
    @Expose
    private Boolean approved;
    @SerializedName("titles")
    @Expose
    private List<Title> titles;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_english")
    @Expose
    private Object titleEnglish;
    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;
    @SerializedName("title_synonyms")
    @Expose
    private List<String> titleSynonyms;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("episodes")
    @Expose
    private Integer episodes;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("airing")
    @Expose
    private Boolean airing;
    @SerializedName("aired")
    @Expose
    private Aired aired;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("score")
    @Expose
    private Float score;
    @SerializedName("scored_by")
    @Expose
    private Integer scoredBy;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("members")
    @Expose
    private Integer members;
    @SerializedName("favorites")
    @Expose
    private Integer favorites;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("season")
    @Expose
    private Object season;
    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("broadcast")
    @Expose
    private Broadcast broadcast;
    @SerializedName("producers")
    @Expose
    private List<Producer> producers;
    @SerializedName("licensors")
    @Expose
    private List<Licensor> licensors;
    @SerializedName("studios")
    @Expose
    private List<Studio> studios;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres;
    @SerializedName("explicit_genres")
    @Expose
    private List<Object> explicitGenres;
    @SerializedName("themes")
    @Expose
    private List<Theme> themes;
    @SerializedName("demographics")
    @Expose
    private List<Demographic> demographics;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(Object titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getTitleJapanese() {
        return titleJapanese;
    }

    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public void setTitleSynonyms(List<String> titleSynonyms) {
        this.titleSynonyms = titleSynonyms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAiring() {
        return airing;
    }

    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    public Aired getAired() {
        return aired;
    }

    public void setAired(Aired aired) {
        this.aired = aired;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getScoredBy() {
        return scoredBy;
    }

    public void setScoredBy(Integer scoredBy) {
        this.scoredBy = scoredBy;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Object getSeason() {
        return season;
    }

    public void setSeason(Object season) {
        this.season = season;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Licensor> getLicensors() {
        return licensors;
    }

    public void setLicensors(List<Licensor> licensors) {
        this.licensors = licensors;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Object> getExplicitGenres() {
        return explicitGenres;
    }

    public void setExplicitGenres(List<Object> explicitGenres) {
        this.explicitGenres = explicitGenres;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<Demographic> getDemographics() {
        return demographics;
    }

    public void setDemographics(List<Demographic> demographics) {
        this.demographics = demographics;
    }

}
