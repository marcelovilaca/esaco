package it.infn.mw.esaco.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_EMPTY)
public class AccessToken {

  private final String algorithm;
  private final String subject;
  private final String issuer;
  private final Long expireAt;
  private final Long issuedAt;
  private final String jwtTokenId;

  @JsonCreator
  public AccessToken(@JsonProperty("alg") String algorithm, @JsonProperty("sub") String subject,
      @JsonProperty("iss") String issuer, @JsonProperty("exp") Long expireAt,
      @JsonProperty("iat") Long issuedAt, @JsonProperty("jti") String jwtTokenId) {

    this.algorithm = algorithm;
    this.subject = subject;
    this.issuer = issuer;
    this.expireAt = expireAt;
    this.issuedAt = issuedAt;
    this.jwtTokenId = jwtTokenId;
  }

  @JsonProperty("alg") 
  public String getAlgorithm() {

    return algorithm;
  }

  @JsonProperty("sub") 
  public String getSubject() {

    return subject;
  }

  @JsonProperty("iss")
  public String getIssuer() {

    return issuer;
  }

  @JsonProperty("exp")
  public Long getExpireAt() {

    return expireAt;
  }

  @JsonProperty("iat")
  public Long getIssuedAt() {

    return issuedAt;
  }

  @JsonProperty("jti")
  public String getJwtTokenId() {

    return jwtTokenId;
  }

}
