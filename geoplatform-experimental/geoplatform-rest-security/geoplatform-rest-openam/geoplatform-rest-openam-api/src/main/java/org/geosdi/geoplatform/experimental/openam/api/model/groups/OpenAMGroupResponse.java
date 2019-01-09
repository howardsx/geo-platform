/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2019 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.experimental.openam.api.model.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class OpenAMGroupResponse implements IOpenAMGroupResponse {

    private static final long serialVersionUID = -6741552245205426270L;
    //
    @JsonProperty(value = "username")
    private String groupName;
    private String realm;
    private List<String> uniqueMember;
    private List<String> cn;
    private List<String> dn;
    @JsonProperty(value = "objectclass")
    private List<String> objectClass;
    @JsonProperty(value = "universalid")
    private List<String> universalId;

    /**
     * @return {@link String}
     */
    @Override
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @param theGroupName
     */
    @Override
    public void setGroupName(String theGroupName) {
        this.groupName = theGroupName;
    }

    /**
     * @return {@link String}
     */
    @Override
    public String getRealm() {
        return this.realm;
    }

    /**
     * @param theRealm
     */
    @Override
    public void setRealm(String theRealm) {
        this.realm = theRealm;
    }

    /**
     * @return {@link List <String>}
     */
    @Override
    public List<String> getUniqueMember() {
        return this.uniqueMember;
    }

    /**
     * @param theUniqueMember
     */
    @Override
    public void setUniqueMember(List<String> theUniqueMember) {
        this.uniqueMember = theUniqueMember;
    }

    /**
     * @return {@link List <String>}
     */
    @Override
    public List<String> getCn() {
        return this.cn;
    }

    /**
     * @param theCn
     */
    @Override
    public void setCn(List<String> theCn) {
        this.cn = theCn;
    }

    /**
     * @return {@link List <String>}
     */
    @Override
    public List<String> getDn() {
        return this.dn;
    }

    /**
     * @param theDn
     */
    @Override
    public void setDn(List<String> theDn) {
        this.dn = theDn;
    }

    /**
     * @return {@link List <String>}
     */
    @Override
    public List<String> getObjectClass() {
        return this.objectClass;
    }

    /**
     * @param theObjectClass
     */
    @Override
    public void setObjectClass(List<String> theObjectClass) {
        this.objectClass = theObjectClass;
    }

    /**
     * @return {@link List <String>}
     */
    @Override
    public List<String> getUniversalId() {
        return this.universalId;
    }

    /**
     * @param theUniversalId
     */
    @Override
    public void setUniversalId(List<String> theUniversalId) {
        this.universalId = theUniversalId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                " groupName = '" + groupName + '\'' +
                ", realm = '" + realm + '\'' +
                ", uniqueMember = " + uniqueMember +
                ", cn = " + cn +
                ", dn = " + dn +
                ", objectClass = " + objectClass +
                ", universalId = " + universalId +
                '}';
    }
}
