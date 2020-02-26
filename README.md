# pglp_3.2

Solution respectant le OCP


  - en premier, on crée la classe qui a une méthode qui calcul de salaire :
      
        public abstract class CalculSalaire{
           private String nom;
           private String adresse;
           
           public double calculSalaire();
        }
  
  - ensuite,la classse employé qui hérite de la classe CalculSalaire avec une valeur de retour
   
         public class Employe extends CalculSalaire{
             @override
             public double calculSalaire(int anciennete){
                return 1500 + 20*anciennete;
             }
           }
           
   - vendeur
   
         public class Vendeur extends CalculSalaire{
              
             @override
             public double calculSalaire(int anciennete, double commission){
                return 1500 + 20*ancinnete + comission;
             }
           }
    
   - somme du salaire de tous les employé :
   
          public class SalaireTotal extends CalculSalaire{
              
             @override
             public double calculSalaire(Employe E, Vendeur V){
                return E.calculSalaire() + V.calculSalaire();
             }
           }
           
   - manager :
           
          public class Manager extends CalculSalaire{
              @override
             public double calculSalaire(Employe E, int sub){
                return E.calculSalaire() + 100*sub;
             }
          }
