package rd.tgic;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import techguns.entities.npcs.GenericNPC;
import techguns.items.guns.GenericGun;

public class tgice {
   @SubscribeEvent
   public void onEquipChange(LivingEquipmentChangeEvent e) {
      if (!e.getEntityLiving().field_70170_p.field_72995_K) {
         if (e.getEntityLiving() instanceof GenericNPC) {
            if (e.getSlot() == EntityEquipmentSlot.MAINHAND) {
               GenericNPC npc = (GenericNPC)e.getEntityLiving();
               boolean fromGun = !e.getFrom().func_190926_b() && e.getFrom().func_77973_b() instanceof GenericGun;
               boolean toGun = !e.getTo().func_190926_b() && e.getTo().func_77973_b() instanceof GenericGun;
               if (fromGun || toGun) {
                  npc.setCombatTask();
               }

            }
         }
      }
   }
}
