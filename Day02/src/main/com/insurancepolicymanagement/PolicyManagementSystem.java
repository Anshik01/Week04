package com.insurancepolicymanagement;

import java.util.*;

class Policy implements Comparable<Policy> {

    HashSet<Policy> hashSet;
    LinkedHashSet<Policy> linkedHashSet;
    TreeSet<Policy> treeSet;

    int policyNumber;
    String holderName;
    int expiryDate;
    String coverageType;
    int premiumAmount;

    Policy(){
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>();
    }

    Policy(int policyNumber, String holderName, int expiryDate, String coverageType, int premiumAmount){
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public void addElements(int policyNumber, String holderName, int expiryDate, String coverageType, int premiumAmount){
        Policy policy = new Policy(policyNumber, holderName, expiryDate, coverageType, premiumAmount);

        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);

    }

    public void displayPolicy(Policy policy){
        System.out.println("Policy Number : " + policy.policyNumber);
        System.out.println("Policy Holder Name : " + policy.holderName);
        System.out.println("Policy expiry date : " + policy.expiryDate);
        System.out.println("Policy coverage type : " + policy.coverageType);
        System.out.println("Policy Premium amount : " + policy.premiumAmount);
        System.out.println();
    }

    public void displayAll(){
        System.out.println("List of Policies : ");
        System.out.println();
        for (Policy policy : hashSet) {
            displayPolicy(policy);
        }
    }

    public void displayGroupedBasedOnCoverageType(String coverageType){
        for (Policy policy : hashSet) {
            if(policy.coverageType.equals(coverageType)){
                displayPolicy(policy);
            }
        }
    }

    public void displayByExpiryDate(){
        for (Policy policy : treeSet) {
            if(policy.expiryDate <= 30){
                displayPolicy(policy);
            }
            else{
                break;
            }
        }
    }

    public void displayDuplicate(int policyNumber){
        for (Policy policy : hashSet) {
            if(policy.policyNumber == policyNumber){
                displayPolicy(policy);
            }
        }
    }

    // overriding compareTo() to specify on the basis of which attribute set should be sorted
    @Override
    public int compareTo(Policy policy) {
        return Integer.compare(this.expiryDate, policy.expiryDate) ;
    }

    public void comparePerformance(Policy policy) {
        long start, end;

        // Adding performance
        start = System.nanoTime();
        hashSet.add(policy);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.add(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.add(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        // Searching performance
        start = System.nanoTime();
        hashSet.contains(policy);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");

        // Removing performance
        start = System.nanoTime();
        hashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("HashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.remove(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Remove: " + (end - start) + " ns");
    }

}

public class PolicyManagementSystem {

    public static void main(String[] args) {
        Policy policy = new Policy();
        policy.addElements(101, "Anshik", 56, "Health", 50000);
        policy.addElements(102, "Aayush", 80, "Health", 80000);
        policy.addElements(103, "Durgesh", 20, "Car", 20000);

        policy.displayByExpiryDate();
        policy.displayGroupedBasedOnCoverageType("Health");
        policy.displayDuplicate(101);
        policy.comparePerformance(policy);

        policy.displayAll();
    }
}
