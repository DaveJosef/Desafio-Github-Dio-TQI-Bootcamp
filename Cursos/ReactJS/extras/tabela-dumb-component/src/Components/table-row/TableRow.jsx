import React from 'react'

export default function TableRow({ entry }) {
  return (
    <tr>
        <td>{entry.id !== undefined ? entry.id : 'X'}</td>
        <td>{entry.nome !== undefined ? entry.nome : 'Sem nome'}</td>
        <td>{entry.idade !== undefined ? entry.idade : 'Sem idade'}</td>
        <td>{entry.peso !== undefined ? entry.peso : 'Sem peso'}</td>
    </tr>
  )
}
