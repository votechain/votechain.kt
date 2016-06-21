package com.android.votechain.candidates.domain.model;

import java.util.List;

/**
 * 21/06/2016.
 */
public class Candidate {

  private String candidateId;
  private String name;
  private String politicParty;
  private String photoUrl;
  private String politicPartyImageUrl;
  private int politicPartyId;
  List<String> proposals;

  public Candidate(String candidateId, String name, String politicParty, String photoUrl,
      String politicPartyImageUrl, int politicPartyId, List<String> proposals) {
    this.candidateId = candidateId;
    this.name = name;
    this.politicParty = politicParty;
    this.photoUrl = photoUrl;
    this.politicPartyImageUrl = politicPartyImageUrl;
    this.politicPartyId = politicPartyId;
    this.proposals = proposals;
  }

  public String getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(String candidateId) {
    this.candidateId = candidateId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPoliticParty() {
    return politicParty;
  }

  public void setPoliticParty(String politicParty) {
    this.politicParty = politicParty;
  }

  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public String getPoliticPartyImageUrl() {
    return politicPartyImageUrl;
  }

  public void setPoliticPartyImageUrl(String politicPartyImageUrl) {
    this.politicPartyImageUrl = politicPartyImageUrl;
  }

  public int getPoliticPartyId() {
    return politicPartyId;
  }

  public void setPoliticPartyId(int politicPartyId) {
    this.politicPartyId = politicPartyId;
  }

  public List<String> getProposals() {
    return proposals;
  }

  public void setProposals(List<String> proposals) {
    this.proposals = proposals;
  }
}
