package cohete;

import Model.Cohete;
import Model.EmpresaAeroespacial;
import Model.NivelEvaluacion;
import Model.PruebaPropulsion;
import Model.PruebaSistema;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        EmpresaAeroespacial agencia = new EmpresaAeroespacial("Space X");
        
        cargarEmpresa(agencia);
        System.out.println(agencia.cantListosParaLanzar());
    }
    
    public static void cargarEmpresa(EmpresaAeroespacial e) {
        Cohete c1 = new Cohete("Falcon 1");
        Cohete c2 = new Cohete("Starship");
    
        c1.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 12, 03)));
        c1.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 10, 03)));
        c1.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 9, 13)));
        c1.agregarPrueba(new PruebaSistema(LocalDate.of(2024, 9, 03), NivelEvaluacion.ACEPTABLE));
        c1.agregarPrueba(new PruebaSistema(LocalDate.of(2024, 12, 03), NivelEvaluacion.EXCELENTE));
        
        c2.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 12, 03)));
        c2.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 10, 03)));
        c2.agregarPrueba(new PruebaPropulsion(60, 7, LocalDate.of(2024, 9, 13)));
        c2.agregarPrueba(new PruebaSistema(LocalDate.of(2024, 9, 03), NivelEvaluacion.DEFICIENTE));
        c2.agregarPrueba(new PruebaSistema(LocalDate.of(2024, 12, 03), NivelEvaluacion.EXCELENTE));
        
        e.agregarCohete(c1);
        e.agregarCohete(c2);
    }
}
