package com.example.Control.de.Acceso;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpamFilterService {

    // Lista de dominios de spam
    private final List<String> spamDomains = List.of(
            "spam.com",
            "phishing.com",
            "malware.com"
            // Puedes añadir más dominios de spam aquí
    );

    // Método para verificar si la URL es spam
    public boolean isSpam(String url) {
        return spamDomains.stream().anyMatch(url::contains);
    }
}
