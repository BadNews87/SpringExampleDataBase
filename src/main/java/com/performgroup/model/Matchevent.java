package com.performgroup.model;

import javax.persistence.Id;

//@Entity
public class Matchevent {
  private Long matchevent_id;
  private String uuid;
  private Long match_id;
  private Long matcheventtype_id;
  private Long team_id;
  private Long opposing_team_id;
  private Long people_id;
  private Long home_gk_people_id;
  private Long away_gk_people_id;
  private java.sql.Timestamp utc_matchevent_timestamp;
  private Long period_id;
  private Long overtime_number;
  private Long period_minute;
  private Double period_second;
  private Long start_period_minute;
  private Double pos_x;
  private Double pos_y;
  private Long team_score_delta;
  private Long home_score_delta;
  private Long away_score_delta;
  private Long version;
  private Long user_id;
  private Long is_deleted;
  private java.sql.Timestamp date_created;
  private java.sql.Timestamp last_modified;
  private Long home_skaters_on_ice;
  private Long away_skaters_on_ice;
  private Long display_order;

  @Id
  public Long getMatchevent_id() {
    return matchevent_id;
  }

  public void setMatchevent_id(Long matchevent_id) {
    this.matchevent_id = matchevent_id;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Long getMatch_id() {
    return match_id;
  }

  public void setMatch_id(Long match_id) {
    this.match_id = match_id;
  }

  public Long getMatcheventtype_id() {
    return matcheventtype_id;
  }

  public void setMatcheventtype_id(Long matcheventtype_id) {
    this.matcheventtype_id = matcheventtype_id;
  }

  public Long getTeam_id() {
    return team_id;
  }

  public void setTeam_id(Long team_id) {
    this.team_id = team_id;
  }

  public Long getOpposing_team_id() {
    return opposing_team_id;
  }

  public void setOpposing_team_id(Long opposing_team_id) {
    this.opposing_team_id = opposing_team_id;
  }

  public Long getPeople_id() {
    return people_id;
  }

  public void setPeople_id(Long people_id) {
    this.people_id = people_id;
  }

  public Long getHome_gk_people_id() {
    return home_gk_people_id;
  }

  public void setHome_gk_people_id(Long home_gk_people_id) {
    this.home_gk_people_id = home_gk_people_id;
  }

  public Long getAway_gk_people_id() {
    return away_gk_people_id;
  }

  public void setAway_gk_people_id(Long away_gk_people_id) {
    this.away_gk_people_id = away_gk_people_id;
  }

  public java.sql.Timestamp getUtc_matchevent_timestamp() {
    return utc_matchevent_timestamp;
  }

  public void setUtc_matchevent_timestamp(java.sql.Timestamp utc_matchevent_timestamp) {
    this.utc_matchevent_timestamp = utc_matchevent_timestamp;
  }

  public Long getPeriod_id() {
    return period_id;
  }

  public void setPeriod_id(Long period_id) {
    this.period_id = period_id;
  }

  public Long getOvertime_number() {
    return overtime_number;
  }

  public void setOvertime_number(Long overtime_number) {
    this.overtime_number = overtime_number;
  }

  public Long getPeriod_minute() {
    return period_minute;
  }

  public void setPeriod_minute(Long period_minute) {
    this.period_minute = period_minute;
  }

  public Double getPeriod_second() {
    return period_second;
  }

  public void setPeriod_second(Double period_second) {
    this.period_second = period_second;
  }

  public Long getStart_period_minute() {
    return start_period_minute;
  }

  public void setStart_period_minute(Long start_period_minute) {
    this.start_period_minute = start_period_minute;
  }

  public Double getPos_x() {
    return pos_x;
  }

  public void setPos_x(Double pos_x) {
    this.pos_x = pos_x;
  }

  public Double getPos_y() {
    return pos_y;
  }

  public void setPos_y(Double pos_y) {
    this.pos_y = pos_y;
  }

  public Long getTeam_score_delta() {
    return team_score_delta;
  }

  public void setTeam_score_delta(Long team_score_delta) {
    this.team_score_delta = team_score_delta;
  }

  public Long getHome_score_delta() {
    return home_score_delta;
  }

  public void setHome_score_delta(Long home_score_delta) {
    this.home_score_delta = home_score_delta;
  }

  public Long getAway_score_delta() {
    return away_score_delta;
  }

  public void setAway_score_delta(Long away_score_delta) {
    this.away_score_delta = away_score_delta;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getIs_deleted() {
    return is_deleted;
  }

  public void setIs_deleted(Long is_deleted) {
    this.is_deleted = is_deleted;
  }

  public java.sql.Timestamp getDate_created() {
    return date_created;
  }

  public void setDate_created(java.sql.Timestamp date_created) {
    this.date_created = date_created;
  }

  public java.sql.Timestamp getLast_modified() {
    return last_modified;
  }

  public void setLast_modified(java.sql.Timestamp last_modified) {
    this.last_modified = last_modified;
  }

  public Long getHome_skaters_on_ice() {
    return home_skaters_on_ice;
  }

  public void setHome_skaters_on_ice(Long home_skaters_on_ice) {
    this.home_skaters_on_ice = home_skaters_on_ice;
  }

  public Long getAway_skaters_on_ice() {
    return away_skaters_on_ice;
  }

  public void setAway_skaters_on_ice(Long away_skaters_on_ice) {
    this.away_skaters_on_ice = away_skaters_on_ice;
  }

  public Long getDisplay_order() {
    return display_order;
  }

  public void setDisplay_order(Long display_order) {
    this.display_order = display_order;
  }
}
