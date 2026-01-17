package org.example.HomeWork8;

abstract class Clinic {
    abstract void treat();
}

class Surgeon extends Clinic {
    void treat() {
        System.out.println("Назначен Хируруг");
        System.out.println("порежет, отпилит, зашьет, хоть бы не хуже сделал...");
          }
}

class Dentist extends Clinic {
    void treat() {
        System.out.println("Назначен Дантист");
        System.out.println("сверлим, светим лампой, плачем от цены за лечение");
    }
}

class Therapist extends Clinic {
    void treat() {
        System.out.println("Назначен Терапевт");
        System.out.println("максимум, может выдать справку в бассейн");
    }

    void treatPlan(Patient patientName) {
        if (patientName.treatmentPlan == 1) {
            patientName.doctor = new Surgeon();
        } else if (patientName.treatmentPlan == 2) {
            patientName.doctor = new Dentist();
        } else {
            patientName.doctor = new Therapist();
        }

        patientName.doctor.treat();
    }

}