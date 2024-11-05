/*package tn.esprit.tpfoyer.service;
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.tpfoyer.service.ChambreServiceImpl;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.mockito.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class ChabreServiceImplTest
{
    @Mock
    private ChambreRepository chambreRepository;

    @InjectMocks
    private ChambreServiceImpl chambreService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddChambre() {
        // Arrange
        Chambre chambre = new Chambre();
        when(chambreRepository.save(chambre)).thenReturn(chambre);

        // Act
        Chambre result = chambreService.addChambre(chambre);

        // Assert
        assertEquals(chambre, result);
        verify(chambreRepository, times(1)).save(chambre);
    }

    /* retrieveChambre */
    @Test
    void testremoveChambre() {
        // Arrange
        long idChambre = 1 ;

        // Act
        chambreService.removeChambre(idChambre);

        // Assert
        verify(chambreRepository, times(1)).deleteById(idChambre);
    }
}
