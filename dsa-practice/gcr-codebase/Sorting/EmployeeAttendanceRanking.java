package gcrCodebase.Sorting;

import java.util.*;

class Employee {

    int id;
    int attendance;

    Employee(int id,int attendance){

        this.id=id;
        this.attendance=attendance;
    }
}

public class EmployeeAttendanceRanking {
    public static void main(String args[]) {
        int employeeIds[]={101,102,103,104,105};
        int attendance[]={92,85,98,92,80};
        int K=3;
        Employee arr[]=new Employee[employeeIds.length];

        for(int i=0;i<employeeIds.length;i++){
            arr[i]=new Employee(employeeIds[i],attendance[i]);
        }

        Arrays.sort(arr,(a,b)->{
            if(a.attendance!=b.attendance)
                return b.attendance-a.attendance;
            return a.id-b.id;
        });

        for(int i=0;i<K;i++){
            System.out.print(arr[i].id+" ");
        }
    }
}