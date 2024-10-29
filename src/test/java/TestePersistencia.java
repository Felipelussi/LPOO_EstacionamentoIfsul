/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.lpoo_estacionamentoifsul.newpackage.dao.PersistenciaJPA;
import model.Marca;
import model.Modelo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class TestePersistencia {

    PersistenciaJPA jpa = new PersistenciaJPA();

    public TestePersistencia() {

    }

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
        Modelo m = new Modelo("Tracker", Marca.CHEVROLET);
        try {
            jpa.persist(m);

        } catch (Exception e) {
            System.out.println("Erro ao persistir model: " + m);
            System.out.println(e);
        }

    }
}
