package edu.unlv.cs.whoseturn.domain;

import java.io.Serializable;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.gwt.user.client.rpc.IsSerializable;


// TODO JAO The following looks like it has information that is from the database.
//		I think the design of this is a bit goofy, but if we are going to go down this
//		road, then we need to make sure that the information is properly initialized in the database.
/**
 * Class used to represent Badges that are awarded to users.
 * 
 * List of Badges: (Extra returns are to allow autoformat to keep things aligned
 * properly.)
 * 
 * BadgeID | Badge Name | Badge Criterion
 * 
 * 1000 | Jackass | User submitted a turn with only himself.
 * 
 * 1001 | Corner Stone | Selected out of group of 4
 * 
 * 1002 | Don't Cross The Streams | Not selected out of group of 4
 * 
 * 1003 | Human Sacrifice | Selected out of group of 5
 * 
 * 1004 | Not The Thumb | Not selected out of group of 5
 * 
 * 1005 | Six Minute Abs | Selected out of group of 6
 * 
 * 1006 | Pick Up Sticks | Not selected out of group of 6
 * 
 * 1007 | Crapped Out | Selected out of group of 7
 * 
 * 1008 | Lucky No. 7 | Not selected out of group of 7
 * 
 * 1009 | Snow White | Selected out of group of 8
 * 
 * 1010 | Dwarf | Not selected out of group of 8
 * 
 * 1011 | FML | Selected out of group of more than 8
 * 
 * 1012 | Statistically Speaking | Not selected out of group of more than 8
 * 
 * 1013 | Saint | User has no lies for 50 turns.
 * 
 * 1014 | Socialite | User is part of a turn with more than 10 people
 * 
 * 1020 | StormShadow | User is Chris Jones
 * 
 * 1021 | MythBusters | User is Matthew Sowders
 */
//@PersistenceCapable
@PersistenceCapable(identityType=IdentityType.APPLICATION,detachable="true")
public class Badge implements IsSerializable {

    /**
     * Default constructor. Needed for Serializable.
     */
    public Badge() {
    }

    /**
     * This is the primary key for the badge.
     */
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName = "datanucleus", key = "gae.encoded-pk", value = "true")
    private String keyString;

    /**
     * Used for reference purposes.
     */
    @Persistent
    private Integer badgeId;

    /**
     * The name of the badge. e.g. Jackass (for Jackass badge)
     */
    @Persistent
    private String badgeName;

    /**
     * A description about the badge. E.g. How it is awarded.
     */
    @Persistent
    private String badgeCriteria;

    /**
     * Soft delete status. true for deleted, false for not deleted.
     */
    @Persistent
    private Boolean deleted;

    /**
     * Persistence manager, used for CRUD operations.
     */
    private PersistenceManager pm = PMF.get().getPersistenceManager();

    // Getters and Setters.
    /**
     * Gets the keyString.
     * 
     * @return keyString as a string.
     */
    public final String getKeyString() {
        return keyString;
    }

    /**
     * Sets teh keyString.
     * 
     * @param keyString
     *            The key string as a string.
     */
    public final void setKeyString(final String keyString) {
        this.keyString = keyString;
    }

    /**
     * Gets the badge name as a string.
     * 
     * @return The badge name.
     */
    public final String getBadgeName() {
        return badgeName;
    }

    /**
     * Sets the badge name.
     * 
     * @param badgeName
     *            The badge name.
     */
    public final void setBadgeName(final String badgeName) {
        this.badgeName = badgeName;
    }

    /**
     * Gets the description of how the badge is awarded.
     * 
     * @return The description.
     */
    public final String getBadgeCriteria() {
        return badgeCriteria;
    }

    /**
     * Sets the criteria of how a badge is awarded.
     * 
     * @param badgeCriteria
     *            The description.
     */
    public final void setBadgeCriteria(final String badgeCriteria) {
        this.badgeCriteria = badgeCriteria;
    }

    /**
     * Gets the deleted state.
     * 
     * @return true for deleted, false for not deleted.
     */
    public final Boolean getDeleted() {
        return deleted;
    }

    /**
     * 
     * Sets the deleted state.
     * 
     * @param deleted
     *            true for deleted.
     */
    public final void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Gets the badge id reference number.
     * 
     * @return The badge id.
     */
    public final Integer getBadgeId() {
        return badgeId;
    }

    /**
     * Sets the badge id reference number.
     * 
     * @param badgeId
     *            The badge id.
     */
    public final void setBadgeId(final Integer badgeId) {
        this.badgeId = badgeId;
    }
}
