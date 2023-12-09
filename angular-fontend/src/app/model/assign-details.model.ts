// export interface AssignDetails{
//     aDId:number;
//     a_M_Id:number;
//     sl:number;
// }
export interface AssignMaster {
    a_M_Id: number;
   
  }
  
  export interface CheckLists {
    sl: number;
  
  }
  
  export interface AssignDetails {
    assign_master: AssignMaster;
    checkLists: CheckLists;
    
  }
  