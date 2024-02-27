public class HeroFactory
{
     



   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   Job temp = null;
	   Hero Hogrider;
      if (jobName.toLowerCase().equals("warrior")) {
    	  temp = new Warrior();
      }
      else if (jobName.toLowerCase().equals("mage")) {
    	  temp = new Mage();
      }
      else if (jobName.toLowerCase().equals("archer")) {
    	  temp = new Archer();
      }
      else {
    	  return null;
      }
      if (raceName.toLowerCase().equals("elf")) {
    	  Hogrider = new Elf(raceName, temp, jobName);
      }
      else if(raceName.toLowerCase().equals("robot")) {
    	  Hogrider = new Robot(raceName, temp, jobName);
      }
      else if(raceName.toLowerCase().equals("dwarf")) {
    	  Hogrider = new Dwarf(raceName, temp, jobName);
      }
      else {
    	  return null;
      }
      return Hogrider;
   }







}