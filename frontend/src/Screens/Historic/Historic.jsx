import React from "react";
import { Chart } from "react-google-charts";

export const data = [
  [
    "Element",
    "Density",
    { role: "style" },
    {
      sourceColumn: 0,
      role: "annotation",
      type: "string",
      calc: "stringify",
    },
  ],
  ["Alunos", 8.94, "#f3f3", null],
  ["Professores", 10.49, "#f3a", null],
  ["Gestores", 19.3, "#f44", null],
  ["Convidados", 21.45, "color: #3e2", null],
];

export const options = {
  title: "Quantidade de Participante",
  width: 600,
  height: 400,
  bar: { groupWidth: "95%" },
  legend: { position: "none" },
};


const Historic = () => {
    return(
        <Chart
            chartType="BarChart"
            width="100%"
            height="400px"
            data={data}
            options={options}
        />
    )
}

export default Historic;