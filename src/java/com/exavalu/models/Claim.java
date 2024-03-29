/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.models;

import com.exavalu.services.ClaimService;
import com.exavalu.services.InsuranceOfficerService;
import com.exavalu.services.UnderwriterService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.interceptor.ApplicationAware;

/**
 *
 * @author user
 */
public class Claim extends ActionSupport implements ApplicationAware, SessionAware, Serializable {

    /**
     * @return the relationAdhar
     */
    public String getRelationAdhar() {
        return relationAdhar;
    }

    /**
     * @param relationAdhar the relationAdhar to set
     */
    public void setRelationAdhar(String relationAdhar) {
        this.relationAdhar = relationAdhar;
    }

    /**
     * @return the disease
     */
    public String getDisease() {
        return disease;
    }

    /**
     * @param disease the disease to set
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }

    /**
     * @return the relativeAge
     */
    public String getRelativeAge() {
        return relativeAge;
    }

    /**
     * @param relativeAge the relativeAge to set
     */
    public void setRelativeAge(String relativeAge) {
        this.relativeAge = relativeAge;
    }

    /**
     * @return the relativeGender
     */
    public String getRelativeGender() {
        return relativeGender;
    }

    /**
     * @param relativeGender the relativeGender to set
     */
    public void setRelativeGender(String relativeGender) {
        this.relativeGender = relativeGender;
    }

    /**
     * @return the childBirthNo
     */
    public String getChildBirthNo() {
        return childBirthNo;
    }

    /**
     * @param childBirthNo the childBirthNo to set
     */
    public void setChildBirthNo(String childBirthNo) {
        this.childBirthNo = childBirthNo;
    }

    /**
     * @return the childAge
     */
    public String getChildAge() {
        return childAge;
    }

    /**
     * @param childAge the childAge to set
     */
    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    /**
     * @return the childGender
     */
    public String getChildGender() {
        return childGender;
    }

    /**
     * @param childGender the childGender to set
     */
    public void setChildGender(String childGender) {
        this.childGender = childGender;
    }

    /**
     * @return the planCompany
     */
    public String getPlanCompany() {
        return planCompany;
    }

    /**
     * @param planCompany the planCompany to set
     */
    public void setPlanCompany(String planCompany) {
        this.planCompany = planCompany;
    }

    /**
     * @return the planDuration
     */
    public String getPlanDuration() {
        return planDuration;
    }

    /**
     * @param planDuration the planDuration to set
     */
    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    /**
     * @return the planAmount
     */
    public String getPlanAmount() {
        return planAmount;
    }

    /**
     * @param planAmount the planAmount to set
     */
    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    /**
     * @return the adharCard
     */
    public String getAdharCard() {
        return adharCard;
    }

    /**
     * @param adharCard the adharCard to set
     */
    public void setAdharCard(String adharCard) {
        this.adharCard = adharCard;
    }

    /**
     * @return the planId
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId the planId to set
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the bikeNumber
     */
    public String getBikeNumber() {
        return bikeNumber;
    }

    /**
     * @param bikeNumber the bikeNumber to set
     */
    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    /**
     * @return the bikeMake
     */
    public String getBikeMake() {
        return bikeMake;
    }

    /**
     * @param bikeMake the bikeMake to set
     */
    public void setBikeMake(String bikeMake) {
        this.bikeMake = bikeMake;
    }

    /**
     * @return the bikeModel
     */
    public String getBikeModel() {
        return bikeModel;
    }

    /**
     * @param bikeModel the bikeModel to set
     */
    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    /**
     * @return the bikeVariant
     */
    public String getBikeVariant() {
        return bikeVariant;
    }

    /**
     * @param bikeVariant the bikeVariant to set
     */
    public void setBikeVariant(String bikeVariant) {
        this.bikeVariant = bikeVariant;
    }

    /**
     * @return the bikeRegistrationYear
     */
    public String getBikeRegistrationYear() {
        return bikeRegistrationYear;
    }

    /**
     * @param bikeRegistrationYear the bikeRegistrationYear to set
     */
    public void setBikeRegistrationYear(String bikeRegistrationYear) {
        this.bikeRegistrationYear = bikeRegistrationYear;
    }

    //INSTANCE VARIABLES
    //for all claims
    private String claimId;
    private String claimExpiryDate;
    private String claimStatus;
    private String claimName;
    private String adharCard;

    private String userId;
    private String fullName;
    private String email;
    private String phone;
    private String age;
    private String categoryId;
    private String categoryName;

    private String policyId;
    private String policyName;
    private String policyDescription;

    //for car insurance only 
    private String incidentDate;
    private String incidentLocation;
    private String policeReportNo;
    private String carModel, carNo, carRegistrationYear;

    private String bikeNumber, bikeMake, bikeModel, bikeVariant, bikeRegistrationYear;
    private String message;

    //for hralth insurance
    private String medicalHistory, relation, dob, relativeName, relativeAge, relativeGender, disease, relationAdhar, relativeType;
    private String gender;

    //for child plan
    private String childName, childAge, childGender, childBirthNo;

    //for investment insurance
    private String occupation, annualIncome;

    //for travel inusrance
    private String travelDestination, travelStartDate, travelEndDate, noOfTravelMembers;

    //for educational plan 
    private String educationLevel;

    //plan deatils
    private String planId;
    private String planCompany, planDuration, planAmount;

    private SessionMap<String, Object> sessionMap = (SessionMap) ActionContext.getContext().getSession();

    private ApplicationMap map = (ApplicationMap) ActionContext.getContext().getApplication();

    @Override
    public void setApplication(Map<String, Object> application) {
        setMap((ApplicationMap) application);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        setSessionMap((SessionMap<String, Object>) (SessionMap) session);
    }

    /**
     * @return the sessionMap
     */
    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    /**
     * @param sessionMap the sessionMap to set
     */
    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    /**
     * @return the map
     */
    public ApplicationMap getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(ApplicationMap map) {
        this.map = map;
    }

    /**
     * @return the claimId
     */
    public String getClaimId() {
        return claimId;
    }

    /**
     * @param claimId the claimId to set
     */
    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    /**
     * @return the claimExpiryDate
     */
    public String getClaimExpiryDate() {
        return claimExpiryDate;
    }

    /**
     * @param claimExpiryDate the claimExpiryDate to set
     */
    public void setClaimExpiryDate(String claimExpiryDate) {
        this.claimExpiryDate = claimExpiryDate;
    }

    /**
     * @return the claimStatus
     */
    public String getClaimStatus() {
        return claimStatus;
    }

    /**
     * @param claimStatus the claimStatus to set
     */
    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    /**
     * @return the claimName
     */
    public String getClaimName() {
        return claimName;
    }

    /**
     * @param claimName the claimName to set
     */
    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * @param policyId the policyId to set
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * @return the policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * @param policyName the policyName to set
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * @return the policyDescription
     */
    public String getPolicyDescription() {
        return policyDescription;
    }

    /**
     * @param policyDescription the policyDescription to set
     */
    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    /**
     * @return the incidentDate
     */
    public String getIncidentDate() {
        return incidentDate;
    }

    /**
     * @param incidentDate the incidentDate to set
     */
    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    /**
     * @return the incidentLocation
     */
    public String getIncidentLocation() {
        return incidentLocation;
    }

    /**
     * @param incidentLocation the incidentLocation to set
     */
    public void setIncidentLocation(String incidentLocation) {
        this.incidentLocation = incidentLocation;
    }

    /**
     * @return the policeReportNo
     */
    public String getPoliceReportNo() {
        return policeReportNo;
    }

    /**
     * @param policeReportNo the policeReportNo to set
     */
    public void setPoliceReportNo(String policeReportNo) {
        this.policeReportNo = policeReportNo;
    }

    /**
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * @return the carNo
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * @param carNo the carNo to set
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * @return the medicalHistory
     */
    public String getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * @param medicalHistory the medicalHistory to set
     */
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * @return the relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * @param relation the relation to set
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the relativeName
     */
    public String getRelativeName() {
        return relativeName;
    }

    /**
     * @param relativeName the relativeName to set
     */
    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    /**
     * @return the childName
     */
    public String getChildName() {
        return childName;
    }

    /**
     * @param childName the childName to set
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the annualIncome
     */
    public String getAnnualIncome() {
        return annualIncome;
    }

    /**
     * @param annualIncome the annualIncome to set
     */
    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * @return the travelStartDate
     */
    public String getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * @param travelStartDate the travelStartDate to set
     */
    public void setTravelStartDate(String travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    /**
     * @return the travelEndDate
     */
    public String getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * @param travelEndDate the travelEndDate to set
     */
    public void setTravelEndDate(String travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    /**
     * @return the noOfTravelMembers
     */
    public String getNoOfTravelMembers() {
        return noOfTravelMembers;
    }

    /**
     * @param noOfTravelMembers the noOfTravelMembers to set
     */
    public void setNoOfTravelMembers(String noOfTravelMembers) {
        this.noOfTravelMembers = noOfTravelMembers;
    }

    /**
     * @return the educationLevel
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * @param educationLevel the educationLevel to set
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * @return the carRegistrationYear
     */
    public String getCarRegistrationYear() {
        return carRegistrationYear;
    }

    /**
     * @param carRegistrationYear the carRegistrationYear to set
     */
    public void setCarRegistrationYear(String carRegistrationYear) {
        this.carRegistrationYear = carRegistrationYear;
    }

    /**
     * @return the travelDestination
     */
    public String getTravelDestination() {
        return travelDestination;
    }

    /**
     * @param travelDestination the travelDestination to set
     */
    public void setTravelDestination(String travelDestination) {
        this.travelDestination = travelDestination;
    }

    public String doAddHealthClaim() {

        String result = "FAILURE";

        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setPolicyId(policyId);
        claim.setMedicalHistory(medicalHistory);
        claim.setRelation(relation);
        claim.setAdharCard(adharCard);
        claim.setRelativeName(relativeName);
        claim.setClaimStatus(claimStatus);

        claim.setFullName(fullName);
        claim.setEmail(email);
        claim.setAge(age);
        claim.setGender(gender);
        claim.setRelativeAge(relativeAge);
        claim.setRelationAdhar(relationAdhar);
        claim.setDisease(disease);

        boolean res = false;
        if (this.relation.equalsIgnoreCase("SE")) {
            res = ClaimService.insertHealthClaim2(claim);
        } else {
            res = ClaimService.insertHealthClaim(claim);
        }

        if (res) {

            if (this.relationAdhar != null) {
                Claim claim1 = ClaimService.getClaimByRelationAdhar(this.relationAdhar);
                sessionMap.put("ClaimId", claim1.claimId);
                sessionMap.put("AdharCard", this.relationAdhar);
                sessionMap.put("RelativeType", claim1.relativeType);
                sessionMap.put("RelativeName", claim1.relativeName);
                sessionMap.put("Disease", this.disease);

                sessionMap.put("PolicyName", claim1.policyName);
                result = "SUCCESS";

            } else {
                Claim claim1 = ClaimService.getClaimByAdhar(this.adharCard);
                sessionMap.put("ClaimId", claim1.claimId);

                sessionMap.put("AdharCard", this.adharCard);
                sessionMap.put("Disease", this.disease);

                sessionMap.put("PolicyName", claim1.policyName);
                result = "SUCCESS";

            }

            sessionMap.put("Success", "successfull");

            System.out.println(" health Successfully Filed");
        } else {
            System.out.println("health not filed!");
        }
        return result;
    }

    public String doAddBikeClaim() {

        String result = "FAILURE";

        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setPolicyId(policyId);
        claim.setBikeNumber(bikeNumber);
        claim.setBikeMake(bikeMake);
        claim.setBikeModel(bikeModel);
       
        claim.setBikeRegistrationYear(bikeRegistrationYear);
        claim.setClaimStatus(claimStatus);

        claim.setFullName(fullName);
        claim.setEmail(email);

        boolean res = ClaimService.insertBikeClaim(claim);
        if (res) {
            result = "SUCCESS";
//            sessionMap.put("ClaimId", this.claimId);
            Claim claim1 = ClaimService.getClaimById(this.bikeNumber);
            sessionMap.put("ClaimId", claim1.claimId);
            sessionMap.put("BikeNumber", this.bikeNumber);
            sessionMap.put("BikeMake", this.bikeMake);
            sessionMap.put("BikeModel", this.bikeModel);
            sessionMap.put("PolicyName", claim1.policyName);
            System.out.println("bike id:" + this.bikeNumber);
            sessionMap.put("Success", "successfull");

            System.out.println("Successfully Filed");
        } else {
            System.out.println("Claim not filed!");
        }
        return result;
    }

    public String doAddChildClaim() {

        String result = "FAILURE";

        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setPolicyId(policyId);
        claim.setChildName(childName);
        claim.setChildAge(childAge);
        claim.setChildGender(childGender);
        claim.setChildBirthNo(childBirthNo);
        claim.setClaimStatus(claimStatus);

        claim.setFullName(fullName);
        claim.setEmail(email);
        claim.setAge(age);
        claim.setMedicalHistory(medicalHistory);

        boolean res = ClaimService.insertChildClaim(claim);
        if (res) {
            result = "SUCCESS";
            Claim claim1 = ClaimService.getClaimByChildBirthNo(this.childBirthNo);
            sessionMap.put("ClaimId", claim1.claimId);
            sessionMap.put("ChildBirthNo", this.childBirthNo);
            sessionMap.put("ChildName", this.childName);
            sessionMap.put("ChildAge", this.childAge);
            sessionMap.put("PolicyName", claim1.policyName);
            //System.out.println("child birth no:"+this.childBirthNo);
//            sessionMap.put("ClaimId", this.claimId);

            sessionMap.put("Success", "successfull");

            System.out.println("Successfully Filed Child Claim");
        } else {
            System.out.println("Child Claim not filed!");
        }
        return result;
    }

    public String doGetClaim() {

        String result = "SUCCESS";
        System.out.println("Current claim is under do getclaim: " + this.getClaimId());
        Claim claim = ClaimService.getClaim(this.getClaimId());
        sessionMap.put("Claim", claim);
        if (claim.getPolicyName().equalsIgnoreCase("Child Investment")) {

            result = "CHILDCLAIM";
            System.out.println("result:childClaim");
        } else if (claim.getPolicyName().equalsIgnoreCase("Two Wheeler")) {
            result = "BIKECLAIM";
            System.out.println("result:bikeClaim");
        } else if (claim.getPolicyName().equalsIgnoreCase("Mediclaim")) {
            result = "MEDICLAIM";
            System.out.println("result:mediClaim");
        }

        System.out.println("FROM CLAIM MODEL:  CLAIM FETCHED");

        return result;
    }

    public String doUpdateBikeClaim() {

        String result = "FAILURE";
        System.out.println("Current claim is: " + this.getClaimId());
        System.out.println("Current claim is: " + this.getIncidentLocation());
        System.out.println("Current claim is: " + this.getIncidentDate());
        boolean res = ClaimService.updateBikeClaim(this);

        if (res) {
            result = "SUCCESS";

            System.out.println("CLAIM status updated to 1");

        } else {
            System.out.println(" CLAIM status not updated to 1");
        }
        return result;
    }

    public String doUpdateChildClaim() {

        String result = "FAILURE";
        System.out.println("Current child claim is: " + this.getClaimId());

        boolean res = ClaimService.updateChildClaim(this);

        if (res) {
            result = "SUCCESS";

            System.out.println("child CLAIM status updated to 1");

        } else {
            System.out.println(" child CLAIM status not updated to 1");
        }
        return result;
    }

    public String doUpdateHealthClaim() {

        String result = "FAILURE";
        System.out.println("Current health claim is: " + this.getClaimId());

        boolean res = ClaimService.updateHealthClaim(this);

        if (res) {
            result = "SUCCESS";

            System.out.println("health CLAIM status updated to 1");

        } else {
            System.out.println(" health CLAIM status not updated to 1");
        }
        return result;
    }

    public String doAddCarClaim() {

        String result = "FAILURE";

        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setPolicyId(policyId);
        claim.setCarNo(carNo);
        claim.setCarModel(carModel);
        claim.setCarRegistrationYear(carRegistrationYear);
        claim.setIncidentLocation(incidentLocation);
        claim.setIncidentDate(incidentDate);
        claim.setPoliceReportNo(policeReportNo);
        claim.setClaimStatus(claimStatus);
        claim.setMessage(message);
        claim.setFullName(fullName);
        claim.setEmail(email);

        boolean res = ClaimService.insertCarClaim(claim);
        if (res) {
            result = "SUCCESS";

            sessionMap.put("Success", "successfull");

            System.out.println("Successfully car fnol Filed");
        } else {
            System.out.println("car Claim not filed!");
        }
        return result;
    }

    public String doAddTravelClaim() {

        String result = "FAILURE";

        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setPolicyId(policyId);
        claim.setTravelDestination(travelDestination);
        claim.setTravelStartDate(travelStartDate);
        claim.setTravelEndDate(travelEndDate);
        claim.setAge(getAge());
        claim.setMedicalHistory(medicalHistory);

        claim.setClaimStatus(claimStatus);
        claim.setMessage(message);
        claim.setFullName(fullName);
        claim.setEmail(email);

        boolean res = ClaimService.insertTravelClaim(claim);
        if (res) {
            result = "SUCCESS";

            sessionMap.put("Success", "successfull");

            System.out.println("Successfully travel fnol Filed");
        } else {
            System.out.println("travel Claim not filed!");
        }
        return result;
    }

    public String doPayment() {

        String result = "FAILURE";

        boolean res = ClaimService.doPayment(this.claimId, this.planId, this.planDuration);
        System.out.println("claimId within dopayment: " + this.claimId);
        System.out.println("res: " + res);
        //System.out.println("res:"+res);
        if (res) {

            result = "SUCCESS";

            System.out.println("policy name=" + this.policyName);
            Claim claim = ClaimService.getClaim(this.claimId);
            sessionMap.put("ClaimExpiryDate", claim.claimExpiryDate);
            if (this.policyName.equalsIgnoreCase("Two Wheeler")) {
                MailSender.sendEmailAfterBikePayment(this.bikeMake, this.bikeModel, this.bikeNumber, this.email);
            }
            if (this.policyName.equalsIgnoreCase("Child Investment")) {
                MailSender.sendEmailAfterChildPayment(this.childName, this.childBirthNo, this.childAge, this.email);
            }
            if(this.policyName.equalsIgnoreCase("Mediclaim"))
            {
                System.out.println("Adhar card"+this.adharCard);
                System.out.println("Relation"+this.relation);
                System.out.println("Relative Name "+this.relativeName);
                MailSender.sendEmailAfterMediclaimPayment(this.adharCard, this.relation, this.relativeName, this.disease,this.email);
            }

            sessionMap.put("Success", "successfull");

            System.out.println("paymnet");
        } else {
            System.out.println("payment not filed!");
        }
        return result;
    }

    public String doApprovePolicy() {
        String result = "SUCCESS";
        UnderwriterService.getInstance().addToApproveHistory(this.claimId);
        ArrayList underwriter_approved_histories = UnderwriterService.getInstance().getAllApprovedHistories();
        sessionMap.put("UnderwriterApprovedHistories", underwriter_approved_histories);
        UnderwriterService.getInstance().approvePolicy(this.claimId);

        ArrayList allPendingMediclaimClaims = UnderwriterService.getInstance().getAllPendingHealthMediclaimClaims();
        ArrayList allPendingCriticalIllnessClaims = UnderwriterService.getInstance().getAllPendingHealthCriticalIllnessClaims();
        ArrayList allPendingTwoWheelerClaims = UnderwriterService.getInstance().getAllPendingCarTwoWheelerClaims();
        ArrayList allPendingFourWheelerClaims = UnderwriterService.getInstance().getAllPendingCarFourWheelerClaims();
        ArrayList allPendingLifeInsuranceClaims = UnderwriterService.getInstance().getAllPendingTermLifeInsuranceClaims();
        ArrayList allPendingTermForNriClaims = UnderwriterService.getInstance().getAllPendingTermForNriClaims();
        ArrayList allPendingChildInvestmentClaims = UnderwriterService.getInstance().getAllPendingInvestmentChildClaims();
        ArrayList allPendingPensionPlanClaims = UnderwriterService.getInstance().getAllPendingInvestmentPensionClaims();
        ArrayList allPendingTravelClaims = UnderwriterService.getInstance().getAllPendingOtherTravelClaims();
        ArrayList allPendingEducationalPlanClaims = UnderwriterService.getInstance().getAllPendingOtherEducationalClaims();

        sessionMap.put("AllPendingMediclaimClaims", allPendingMediclaimClaims);
        sessionMap.put("AllPendingCriticalIllnessClaims", allPendingCriticalIllnessClaims);
        sessionMap.put("AllPendingTwoWheelerClaims", allPendingTwoWheelerClaims);
        sessionMap.put("AllPendingFourWheelerClaims", allPendingFourWheelerClaims);
        sessionMap.put("AllPendingLifeInsuranceClaims", allPendingLifeInsuranceClaims);
        sessionMap.put("AllPendingTermForNriClaims", allPendingTermForNriClaims);
        sessionMap.put("AllPendingChildInvestmentClaims", allPendingChildInvestmentClaims);
        sessionMap.put("AllPendingPensionPlanClaims", allPendingPensionPlanClaims);
        sessionMap.put("AllPendingTravelClaims", allPendingTravelClaims);
        sessionMap.put("AllPendingEducationalPlanClaims", allPendingEducationalPlanClaims);
        return result;

    }

    public String doRejectPolicy() {
        String result = "SUCCESS";
        UnderwriterService.getInstance().addToRejectedHistory(this.claimId);
        ArrayList underwriter_rejected_histories = UnderwriterService.getInstance().getAllRejectedHistories();
        sessionMap.put("UnderwriterRejectedHistories", underwriter_rejected_histories);
        UnderwriterService.getInstance().rejectPolicy(this.claimId);

        ArrayList allPendingMediclaimClaims = UnderwriterService.getInstance().getAllPendingHealthMediclaimClaims();
        ArrayList allPendingCriticalIllnessClaims = UnderwriterService.getInstance().getAllPendingHealthCriticalIllnessClaims();
        ArrayList allPendingTwoWheelerClaims = UnderwriterService.getInstance().getAllPendingCarTwoWheelerClaims();
        ArrayList allPendingFourWheelerClaims = UnderwriterService.getInstance().getAllPendingCarFourWheelerClaims();
        ArrayList allPendingLifeInsuranceClaims = UnderwriterService.getInstance().getAllPendingTermLifeInsuranceClaims();
        ArrayList allPendingTermForNriClaims = UnderwriterService.getInstance().getAllPendingTermForNriClaims();
        ArrayList allPendingChildInvestmentClaims = UnderwriterService.getInstance().getAllPendingInvestmentChildClaims();
        ArrayList allPendingPensionPlanClaims = UnderwriterService.getInstance().getAllPendingInvestmentPensionClaims();
        ArrayList allPendingTravelClaims = UnderwriterService.getInstance().getAllPendingOtherTravelClaims();
        ArrayList allPendingEducationalPlanClaims = UnderwriterService.getInstance().getAllPendingOtherEducationalClaims();

        sessionMap.put("AllPendingMediclaimClaims", allPendingMediclaimClaims);
        sessionMap.put("AllPendingCriticalIllnessClaims", allPendingCriticalIllnessClaims);
        sessionMap.put("AllPendingTwoWheelerClaims", allPendingTwoWheelerClaims);
        sessionMap.put("AllPendingFourWheelerClaims", allPendingFourWheelerClaims);
        sessionMap.put("AllPendingLifeInsuranceClaims", allPendingLifeInsuranceClaims);
        sessionMap.put("AllPendingTermForNriClaims", allPendingTermForNriClaims);
        sessionMap.put("AllPendingChildInvestmentClaims", allPendingChildInvestmentClaims);
        sessionMap.put("AllPendingPensionPlanClaims", allPendingPensionPlanClaims);
        sessionMap.put("AllPendingTravelClaims", allPendingTravelClaims);
        sessionMap.put("AllPendingEducationalPlanClaims", allPendingEducationalPlanClaims);
        return result;

    }

    public String doSanctionPolicy() {
        String result = "SUCCESS";
        InsuranceOfficerService.getInstance().addToSanctionedHistory(this.claimId);
        ArrayList insuranceOfficer_sanctioned_histories = InsuranceOfficerService.getInstance().getAllSanctionedHistories();
        sessionMap.put("InsuranceOfficerSanctionedHistories", insuranceOfficer_sanctioned_histories);
        InsuranceOfficerService.getInstance().sanctionPolicy(this.claimId);

        ArrayList allApprovedMediclaimClaims = InsuranceOfficerService.getInstance().getAllApprovedHealthMediclaimClaims();
        ArrayList allApprovedCriticalIllnessClaims = InsuranceOfficerService.getInstance().getAllApprovedHealthCriticalIllnessClaims();
        ArrayList allApprovedTwoWheelerClaims = InsuranceOfficerService.getInstance().getAllApprovedCarTwoWheelerClaims();
        ArrayList allApprovedFourWheelerClaims = InsuranceOfficerService.getInstance().getAllApprovedCarFourWheelerClaims();
        ArrayList allApprovedLifeInsuranceClaims = InsuranceOfficerService.getInstance().getAllApprovedTermLifeInsuranceClaims();
        ArrayList allApprovedTermForNriClaims = InsuranceOfficerService.getInstance().getAllApprovedTermForNriClaims();
        ArrayList allApprovedChildInvestmentClaims = InsuranceOfficerService.getInstance().getAllApprovedInvestmentChildClaims();
        ArrayList allApprovedPensionPlanClaims = InsuranceOfficerService.getInstance().getAllApprovedInvestmentPensionClaims();
        ArrayList allApprovedTravelClaims = InsuranceOfficerService.getInstance().getAllApprovedOtherTravelClaims();
        ArrayList allApprovedEducationalPlanClaims = InsuranceOfficerService.getInstance().getAllApprovedOtherEducationalClaims();

        sessionMap.put("AllApprovedMediclaimClaims", allApprovedMediclaimClaims);
        sessionMap.put("AllApprovedCriticalIllnessClaims", allApprovedCriticalIllnessClaims);
        sessionMap.put("AllApprovedTwoWheelerClaims", allApprovedTwoWheelerClaims);
        sessionMap.put("AllApprovedFourWheelerClaims", allApprovedFourWheelerClaims);
        sessionMap.put("AllApprovedLifeInsuranceClaims", allApprovedLifeInsuranceClaims);
        sessionMap.put("AllApprovedTermForNriClaims", allApprovedTermForNriClaims);
        sessionMap.put("AllApprovedChildInvestmentClaims", allApprovedChildInvestmentClaims);
        sessionMap.put("AllApprovedPensionPlanClaims", allApprovedPensionPlanClaims);
        sessionMap.put("AllApprovedTravelClaims", allApprovedTravelClaims);
        sessionMap.put("AllApprovedEducationalPlanClaims", allApprovedEducationalPlanClaims);
        return result;

    }

    public String doSearchClaim() {
        String result = "SUCCESS";
        Claim particularClaim = ClaimService.searchClaim(this.claimId);

        if (particularClaim.getPolicyName().equalsIgnoreCase("Child Investment")) {

            result = "CHILDCLAIM";
            //System.out.println("result:childClaim");
        } else if (particularClaim.getPolicyName().equalsIgnoreCase("Two Wheeler")) {
            result = "BIKECLAIM";
            //System.out.println("result:bikeClaim");
        } else if (particularClaim.getPolicyName().equalsIgnoreCase("Mediclaim")) {
            Claim particularMedClaim = ClaimService.searchMedClaim(this.claimId);
            sessionMap.put("ParticularMedClaim", particularMedClaim);
            result = "MEDICLAIM";
            System.out.println("result:mediClaim");
        }
        sessionMap.put("ParticularClaim", particularClaim);
        return result;
    }

    public String doGetPlanDetails() {
        String result = "FAILURE";
        Plan plan = ClaimService.getPlanDetails(this.planId);
        if (plan != null) {
            result = "SUCCESS";
            sessionMap.put("Plan", plan);
        }

        return result;
    }

    /**
     * @return the relativeType
     */
    public String getRelativeType() {
        return relativeType;
    }

    /**
     * @param relativeType the relativeType to set
     */
    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }

}
