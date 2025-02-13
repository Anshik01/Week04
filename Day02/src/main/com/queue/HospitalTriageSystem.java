package com.queue;

import java.util.PriorityQueue;

// using comparable to make sure priority is done in descending order
class Patient implements Comparable<Patient>{
    String name;
    int priority;     // the more tha value the more the priority


    // making priorityQueue private to increase security
    private PriorityQueue<Patient> priorityQueue;

    Patient(){
        // initialize priorityQueue
        priorityQueue  = new PriorityQueue<>();
    }

    Patient(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient patient) {
        // comparing priority value then inserting it in queue
        return Integer.compare(patient.priority, this.priority);
    }

    public void addPatient(String name, int priority){
        Patient patient = new Patient(name, priority);

        priorityQueue.add(patient);
    }

    public PriorityQueue<Patient> displayPatient(){
        return priorityQueue;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.addPatient("Anshik", 1);
        patient.addPatient("Aayush", 5);
        patient.addPatient("Durgesh", 20);

        // holding priority list in this variable
        PriorityQueue<Patient> priorityQueue = patient.displayPatient();

        for (Patient p : priorityQueue) {
            System.out.print(p.name + " ");
        }
    }
}
