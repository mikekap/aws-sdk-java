/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Guidelines for use with FlexMatch to match players into games. All matchmaking requests must specify a matchmaking
 * configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/MatchmakingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchmakingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated
     * with a matchmaking request or ticket.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Descriptive label that is associated with matchmaking configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session queue and uniquely identifies it. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These queues are
     * used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be
     * located in any region.
     * </p>
     */
    private java.util.List<String> gameSessionQueueArns;
    /**
     * <p>
     * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that
     * time out can be resubmitted as needed.
     * </p>
     */
    private Integer requestTimeoutSeconds;
    /**
     * <p>
     * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or
     * fails to accept before the timeout, the ticket continues to look for an acceptable match.
     * </p>
     */
    private Integer acceptanceTimeoutSeconds;
    /**
     * <p>
     * Flag that determines whether or not a match that was created with this configuration must be accepted by the
     * matched players. To require acceptance, set to TRUE.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only
     * use rule sets that are defined in the same region.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * SNS topic ARN that is set up to receive matchmaking notifications.
     * </p>
     */
    private String notificationTarget;
    /**
     * <p>
     * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set
     * specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are
     * selected for the match.
     * </p>
     */
    private Integer additionalPlayerCount;
    /**
     * <p>
     * Information to attached to all events related to the matchmaking configuration.
     * </p>
     */
    private String customEventData;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     */
    private String gameSessionData;

    /**
     * <p>
     * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated
     * with a matchmaking request or ticket.
     * </p>
     * 
     * @param name
     *        Unique identifier for a matchmaking configuration. This name is used to identify the configuration
     *        associated with a matchmaking request or ticket.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated
     * with a matchmaking request or ticket.
     * </p>
     * 
     * @return Unique identifier for a matchmaking configuration. This name is used to identify the configuration
     *         associated with a matchmaking request or ticket.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated
     * with a matchmaking request or ticket.
     * </p>
     * 
     * @param name
     *        Unique identifier for a matchmaking configuration. This name is used to identify the configuration
     *        associated with a matchmaking request or ticket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with matchmaking configuration.
     * </p>
     * 
     * @param description
     *        Descriptive label that is associated with matchmaking configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive label that is associated with matchmaking configuration.
     * </p>
     * 
     * @return Descriptive label that is associated with matchmaking configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive label that is associated with matchmaking configuration.
     * </p>
     * 
     * @param description
     *        Descriptive label that is associated with matchmaking configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session queue and uniquely identifies it. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These queues are
     * used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be
     * located in any region.
     * </p>
     * 
     * @return Amazon Resource Name (<a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         game session queue and uniquely identifies it. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These
     *         queues are used when placing game sessions for matches that are created with this matchmaking
     *         configuration. Queues can be located in any region.
     */

    public java.util.List<String> getGameSessionQueueArns() {
        return gameSessionQueueArns;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session queue and uniquely identifies it. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These queues are
     * used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be
     * located in any region.
     * </p>
     * 
     * @param gameSessionQueueArns
     *        Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     *        that is assigned to a game session queue and uniquely identifies it. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These
     *        queues are used when placing game sessions for matches that are created with this matchmaking
     *        configuration. Queues can be located in any region.
     */

    public void setGameSessionQueueArns(java.util.Collection<String> gameSessionQueueArns) {
        if (gameSessionQueueArns == null) {
            this.gameSessionQueueArns = null;
            return;
        }

        this.gameSessionQueueArns = new java.util.ArrayList<String>(gameSessionQueueArns);
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session queue and uniquely identifies it. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These queues are
     * used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be
     * located in any region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameSessionQueueArns(java.util.Collection)} or {@link #withGameSessionQueueArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param gameSessionQueueArns
     *        Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     *        that is assigned to a game session queue and uniquely identifies it. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These
     *        queues are used when placing game sessions for matches that are created with this matchmaking
     *        configuration. Queues can be located in any region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withGameSessionQueueArns(String... gameSessionQueueArns) {
        if (this.gameSessionQueueArns == null) {
            setGameSessionQueueArns(new java.util.ArrayList<String>(gameSessionQueueArns.length));
        }
        for (String ele : gameSessionQueueArns) {
            this.gameSessionQueueArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session queue and uniquely identifies it. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These queues are
     * used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be
     * located in any region.
     * </p>
     * 
     * @param gameSessionQueueArns
     *        Amazon Resource Name (<a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     *        that is assigned to a game session queue and uniquely identifies it. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. These
     *        queues are used when placing game sessions for matches that are created with this matchmaking
     *        configuration. Queues can be located in any region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withGameSessionQueueArns(java.util.Collection<String> gameSessionQueueArns) {
        setGameSessionQueueArns(gameSessionQueueArns);
        return this;
    }

    /**
     * <p>
     * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that
     * time out can be resubmitted as needed.
     * </p>
     * 
     * @param requestTimeoutSeconds
     *        Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests
     *        that time out can be resubmitted as needed.
     */

    public void setRequestTimeoutSeconds(Integer requestTimeoutSeconds) {
        this.requestTimeoutSeconds = requestTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that
     * time out can be resubmitted as needed.
     * </p>
     * 
     * @return Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests
     *         that time out can be resubmitted as needed.
     */

    public Integer getRequestTimeoutSeconds() {
        return this.requestTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that
     * time out can be resubmitted as needed.
     * </p>
     * 
     * @param requestTimeoutSeconds
     *        Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests
     *        that time out can be resubmitted as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withRequestTimeoutSeconds(Integer requestTimeoutSeconds) {
        setRequestTimeoutSeconds(requestTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or
     * fails to accept before the timeout, the ticket continues to look for an acceptable match.
     * </p>
     * 
     * @param acceptanceTimeoutSeconds
     *        Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the
     *        match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
     */

    public void setAcceptanceTimeoutSeconds(Integer acceptanceTimeoutSeconds) {
        this.acceptanceTimeoutSeconds = acceptanceTimeoutSeconds;
    }

    /**
     * <p>
     * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or
     * fails to accept before the timeout, the ticket continues to look for an acceptable match.
     * </p>
     * 
     * @return Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the
     *         match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
     */

    public Integer getAcceptanceTimeoutSeconds() {
        return this.acceptanceTimeoutSeconds;
    }

    /**
     * <p>
     * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or
     * fails to accept before the timeout, the ticket continues to look for an acceptable match.
     * </p>
     * 
     * @param acceptanceTimeoutSeconds
     *        Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the
     *        match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withAcceptanceTimeoutSeconds(Integer acceptanceTimeoutSeconds) {
        setAcceptanceTimeoutSeconds(acceptanceTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * Flag that determines whether or not a match that was created with this configuration must be accepted by the
     * matched players. To require acceptance, set to TRUE.
     * </p>
     * 
     * @param acceptanceRequired
     *        Flag that determines whether or not a match that was created with this configuration must be accepted by
     *        the matched players. To require acceptance, set to TRUE.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Flag that determines whether or not a match that was created with this configuration must be accepted by the
     * matched players. To require acceptance, set to TRUE.
     * </p>
     * 
     * @return Flag that determines whether or not a match that was created with this configuration must be accepted by
     *         the matched players. To require acceptance, set to TRUE.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Flag that determines whether or not a match that was created with this configuration must be accepted by the
     * matched players. To require acceptance, set to TRUE.
     * </p>
     * 
     * @param acceptanceRequired
     *        Flag that determines whether or not a match that was created with this configuration must be accepted by
     *        the matched players. To require acceptance, set to TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Flag that determines whether or not a match that was created with this configuration must be accepted by the
     * matched players. To require acceptance, set to TRUE.
     * </p>
     * 
     * @return Flag that determines whether or not a match that was created with this configuration must be accepted by
     *         the matched players. To require acceptance, set to TRUE.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only
     * use rule sets that are defined in the same region.
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration
     *        can only use rule sets that are defined in the same region.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only
     * use rule sets that are defined in the same region.
     * </p>
     * 
     * @return Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration
     *         can only use rule sets that are defined in the same region.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only
     * use rule sets that are defined in the same region.
     * </p>
     * 
     * @param ruleSetName
     *        Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration
     *        can only use rule sets that are defined in the same region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * SNS topic ARN that is set up to receive matchmaking notifications.
     * </p>
     * 
     * @param notificationTarget
     *        SNS topic ARN that is set up to receive matchmaking notifications.
     */

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    /**
     * <p>
     * SNS topic ARN that is set up to receive matchmaking notifications.
     * </p>
     * 
     * @return SNS topic ARN that is set up to receive matchmaking notifications.
     */

    public String getNotificationTarget() {
        return this.notificationTarget;
    }

    /**
     * <p>
     * SNS topic ARN that is set up to receive matchmaking notifications.
     * </p>
     * 
     * @param notificationTarget
     *        SNS topic ARN that is set up to receive matchmaking notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withNotificationTarget(String notificationTarget) {
        setNotificationTarget(notificationTarget);
        return this;
    }

    /**
     * <p>
     * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set
     * specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are
     * selected for the match.
     * </p>
     * 
     * @param additionalPlayerCount
     *        Number of player slots in a match to keep open for future players. For example, if the configuration's
     *        rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only
     *        10 players are selected for the match.
     */

    public void setAdditionalPlayerCount(Integer additionalPlayerCount) {
        this.additionalPlayerCount = additionalPlayerCount;
    }

    /**
     * <p>
     * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set
     * specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are
     * selected for the match.
     * </p>
     * 
     * @return Number of player slots in a match to keep open for future players. For example, if the configuration's
     *         rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only
     *         10 players are selected for the match.
     */

    public Integer getAdditionalPlayerCount() {
        return this.additionalPlayerCount;
    }

    /**
     * <p>
     * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set
     * specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are
     * selected for the match.
     * </p>
     * 
     * @param additionalPlayerCount
     *        Number of player slots in a match to keep open for future players. For example, if the configuration's
     *        rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only
     *        10 players are selected for the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withAdditionalPlayerCount(Integer additionalPlayerCount) {
        setAdditionalPlayerCount(additionalPlayerCount);
        return this;
    }

    /**
     * <p>
     * Information to attached to all events related to the matchmaking configuration.
     * </p>
     * 
     * @param customEventData
     *        Information to attached to all events related to the matchmaking configuration.
     */

    public void setCustomEventData(String customEventData) {
        this.customEventData = customEventData;
    }

    /**
     * <p>
     * Information to attached to all events related to the matchmaking configuration.
     * </p>
     * 
     * @return Information to attached to all events related to the matchmaking configuration.
     */

    public String getCustomEventData() {
        return this.customEventData;
    }

    /**
     * <p>
     * Information to attached to all events related to the matchmaking configuration.
     * </p>
     * 
     * @param customEventData
     *        Information to attached to all events related to the matchmaking configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withCustomEventData(String customEventData) {
        setCustomEventData(customEventData);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @return Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *         a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *         href=
     *         "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *         >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is
     *         created for a successful match.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created
     *        for a successful match.
     */

    public void setGameProperties(java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(gameProperties);
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created
     *        for a successful match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created
     *        for a successful match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @param gameSessionData
     *        Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created
     *        for a successful match.
     */

    public void setGameSessionData(String gameSessionData) {
        this.gameSessionData = gameSessionData;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @return Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *         server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *         "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *         >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is
     *         created for a successful match.
     */

    public String getGameSessionData() {
        return this.gameSessionData;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created for a
     * successful match.
     * </p>
     * 
     * @param gameSessionData
     *        Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>). This information is added to the new <a>GameSession</a> object that is created
     *        for a successful match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingConfiguration withGameSessionData(String gameSessionData) {
        setGameSessionData(gameSessionData);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGameSessionQueueArns() != null)
            sb.append("GameSessionQueueArns: ").append(getGameSessionQueueArns()).append(",");
        if (getRequestTimeoutSeconds() != null)
            sb.append("RequestTimeoutSeconds: ").append(getRequestTimeoutSeconds()).append(",");
        if (getAcceptanceTimeoutSeconds() != null)
            sb.append("AcceptanceTimeoutSeconds: ").append(getAcceptanceTimeoutSeconds()).append(",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
        if (getNotificationTarget() != null)
            sb.append("NotificationTarget: ").append(getNotificationTarget()).append(",");
        if (getAdditionalPlayerCount() != null)
            sb.append("AdditionalPlayerCount: ").append(getAdditionalPlayerCount()).append(",");
        if (getCustomEventData() != null)
            sb.append("CustomEventData: ").append(getCustomEventData()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getGameSessionData() != null)
            sb.append("GameSessionData: ").append(getGameSessionData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchmakingConfiguration == false)
            return false;
        MatchmakingConfiguration other = (MatchmakingConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGameSessionQueueArns() == null ^ this.getGameSessionQueueArns() == null)
            return false;
        if (other.getGameSessionQueueArns() != null && other.getGameSessionQueueArns().equals(this.getGameSessionQueueArns()) == false)
            return false;
        if (other.getRequestTimeoutSeconds() == null ^ this.getRequestTimeoutSeconds() == null)
            return false;
        if (other.getRequestTimeoutSeconds() != null && other.getRequestTimeoutSeconds().equals(this.getRequestTimeoutSeconds()) == false)
            return false;
        if (other.getAcceptanceTimeoutSeconds() == null ^ this.getAcceptanceTimeoutSeconds() == null)
            return false;
        if (other.getAcceptanceTimeoutSeconds() != null && other.getAcceptanceTimeoutSeconds().equals(this.getAcceptanceTimeoutSeconds()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getNotificationTarget() == null ^ this.getNotificationTarget() == null)
            return false;
        if (other.getNotificationTarget() != null && other.getNotificationTarget().equals(this.getNotificationTarget()) == false)
            return false;
        if (other.getAdditionalPlayerCount() == null ^ this.getAdditionalPlayerCount() == null)
            return false;
        if (other.getAdditionalPlayerCount() != null && other.getAdditionalPlayerCount().equals(this.getAdditionalPlayerCount()) == false)
            return false;
        if (other.getCustomEventData() == null ^ this.getCustomEventData() == null)
            return false;
        if (other.getCustomEventData() != null && other.getCustomEventData().equals(this.getCustomEventData()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getGameSessionData() == null ^ this.getGameSessionData() == null)
            return false;
        if (other.getGameSessionData() != null && other.getGameSessionData().equals(this.getGameSessionData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGameSessionQueueArns() == null) ? 0 : getGameSessionQueueArns().hashCode());
        hashCode = prime * hashCode + ((getRequestTimeoutSeconds() == null) ? 0 : getRequestTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceTimeoutSeconds() == null) ? 0 : getAcceptanceTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getNotificationTarget() == null) ? 0 : getNotificationTarget().hashCode());
        hashCode = prime * hashCode + ((getAdditionalPlayerCount() == null) ? 0 : getAdditionalPlayerCount().hashCode());
        hashCode = prime * hashCode + ((getCustomEventData() == null) ? 0 : getCustomEventData().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getGameSessionData() == null) ? 0 : getGameSessionData().hashCode());
        return hashCode;
    }

    @Override
    public MatchmakingConfiguration clone() {
        try {
            return (MatchmakingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.MatchmakingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
