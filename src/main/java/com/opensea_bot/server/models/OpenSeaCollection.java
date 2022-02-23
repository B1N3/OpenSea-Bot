package com.opensea_bot.server.models;

import com.opensea_bot.server.enums.OpenSeaCollectionStatus;

import java.util.ArrayList;
import java.util.List;

public class OpenSeaCollection {
    private String name;
    private String externalLink;
    private String description;
    private String slug;
    private String imageUrl;
    private String bannerImageUrl;
    private OpenSeaCollectionStatus safelistRequestStatus;
    private String payoutAddress;
    private List<OpenSeaCollectionPrimaryAssetContract> primaryAssetContracts;
    private List<OpenSeaAssetTrait> traits;
    private List<OpenSeaCollectionPaymentToken> paymentTokens;
    private List<String> editors;
    private OpenSeaCollectionStats stats;


    public OpenSeaCollection() {
        this.primaryAssetContracts = new ArrayList<>();
        this.traits = new ArrayList<>();
        this.paymentTokens = new ArrayList<>();
        this.editors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl;
    }

    public OpenSeaCollectionStatus getSafelistRequestStatus() {
        return safelistRequestStatus;
    }

    public void setSafelistRequestStatus(OpenSeaCollectionStatus safelistRequestStatus) {
        this.safelistRequestStatus = safelistRequestStatus;
    }

    public String getPayoutAddress() {
        return payoutAddress;
    }

    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
    }

    public List<OpenSeaAssetTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<OpenSeaAssetTrait> traits) {
        this.traits = traits;
    }

    public List<String> getEditors() {
        return editors;
    }

    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    public OpenSeaCollectionStats getStats() {
        return stats;
    }

    public void setStats(OpenSeaCollectionStats stats) {
        this.stats = stats;
    }

    public List<OpenSeaCollectionPrimaryAssetContract> getPrimaryAssetContracts() {
        return primaryAssetContracts;
    }

    public void setPrimaryAssetContracts(List<OpenSeaCollectionPrimaryAssetContract> primaryAssetContracts) {
        this.primaryAssetContracts = primaryAssetContracts;
    }

    public List<OpenSeaCollectionPaymentToken> getPaymentTokens() {
        return paymentTokens;
    }

    public void setPaymentTokens(List<OpenSeaCollectionPaymentToken> paymentTokens) {
        this.paymentTokens = paymentTokens;
    }
}
