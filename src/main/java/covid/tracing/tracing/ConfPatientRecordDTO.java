package covid.tracing.tracing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfPatientRecordDTO {

    private ConfPatientRecordInfoDetail confPatient;
}
