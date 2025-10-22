package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ");
        if (prefix != null && !prefix.trim().isEmpty()) {
            sb.append(prefix.trim()).append(" ");
        }
        sb.append(firstName.trim());
        if (middleName != null && !middleName.trim().isEmpty()) {
            sb.append(" ").append(middleName.trim());
        }
        if (suffix != null && !suffix.trim().isEmpty()) {
            sb.append(", ").append(suffix.trim());
        }
        return sb.toString();
    }


    public static String format(String firstName, String lastName) {
        return format(null, firstName, null, lastName, null);
    }

    public static String format(String fullName) {
        String prefix=null;
        String firstName="";
        String middleName=null;
        String lastName="";
        String suffix=null;
        String splitByComma[]= fullName.split(",");
        String beforeComma= splitByComma[0];
        if(splitByComma.length>1){
            suffix=splitByComma[1];
        }
        String names[]= beforeComma.split(" ");
        if(names.length==4){
            prefix=names[0];
            firstName=names[1];
            middleName=names[2];
            lastName=names[3];
        }
        if(names.length==3) {
            if (names[0].endsWith(".")) {
                prefix = names[0];
                firstName = names[1];
                lastName = names[2];
            } else {
                firstName = names[0];
                middleName = names[1];
                lastName = names[2];
            }
        }
        if(names.length==2){
            firstName=names[0];
            lastName=names[1];
        }
        return format(prefix,firstName,middleName,lastName,suffix);

    }
}

