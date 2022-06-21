const checkStudent = (student, mean) => {
    const {nota} = student;
    return nota >= mean;
}

const filterApproved = (students, mean) => {
    return students.filter(student => checkStudent(student, mean));
}

const students = [
    {
        nome: 'Ana',
        nota: 7.0,
        matricula: 1,
    },
    {
        nome: 'Maria',
        nota: 10.0,
        matricula: 2,
    },
    {
        nome: 'João',
        nota: 5.0,
        matricula: 3,
    },
    {
        nome: 'José',
        nota: 4.0,
        matricula: 4,
    },
]
/* [
    { nome: 'Ana', nota: 7, matricula: 1 },
    { nome: 'Maria', nota: 10, matricula: 2 }
] */
console.log(filterApproved(students, 7.0));
