package hr.tvz.pios.scheduler.dto.response;

import hr.tvz.pios.scheduler.model.UserPreferences;
import hr.tvz.pios.scheduler.model.UserRole;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 4881125465100603826L;

    private final Long id;
    private final String jwtToken;
    private final String email;
    private final UserRole role;
    private final UserPreferences preferences;
}