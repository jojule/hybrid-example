import { DatePicker } from "@hilla/react-components/DatePicker.js";
import { Grid } from "@hilla/react-components/Grid.js";
import { GridSortColumn } from "@hilla/react-components/GridSortColumn.js";
import { useEffect, useState } from "react";
import Person from "Frontend/generated/com/example/application/services/Person";
import { PersonService } from "Frontend/generated/endpoints";

export default function HelloWorldView() {
    const [people, setPeople] = useState<Person[]>([]);
    const [date, setDate] = useState('');

    useEffect(() => {
        PersonService.getPeopleBornOn(date).then(setPeople);
    }, [date]);

    return (
        <div className="flex flex-col gap-m items-start p-m">
            <DatePicker label="Born on"
                onValueChanged={e => setDate(e.detail.value)} />
            <Grid items={people} >
                <GridSortColumn path="birthDate" />
                <GridSortColumn path="firstName" />
                <GridSortColumn path="lastName" />
            </Grid>
        </div >
    );
}
