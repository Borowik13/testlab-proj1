package custom_database;

import hibernateonetomany.Certificate;

public class Directory {
   private int id;
   private String dir_name;
   private int rights;

   public Directory() {
   }
   
   public Directory(String dir_name, int rights) {
      this.dir_name = dir_name;
      this.rights = rights;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getDirName() {
      return dir_name;
   }
   
   public void setDirName(String dir_name) {
      this.dir_name = dir_name;
   }
   
   @Override
   public boolean equals(Object obj) {
      return obj != null
              && obj instanceof Directory
              && this.id == ((Directory)obj).id
              && this.dir_name.equals(((Directory)obj).dir_name)
              && this.rights == ((Directory)obj).rights;
   }
   
   @Override
   public int hashCode() {
      int tmp = 0;
      tmp = (id + dir_name + rights).hashCode();
      return tmp;
   }     
}
