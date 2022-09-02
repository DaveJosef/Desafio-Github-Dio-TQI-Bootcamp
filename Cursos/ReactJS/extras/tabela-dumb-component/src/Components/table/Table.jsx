import React from 'react'
import TableHeader from '../table-header/TableHeader'
import TableRow from '../table-row/TableRow'
import './Table.css';

export default function Table({ entries }) {

    const entriesMap = (entry, index) => <TableRow key={`${index}entry`} entry={entry} ></TableRow>
    
  return (
    <div>
        <table>
            <TableHeader></TableHeader>
            <tbody>
                {entries !== undefined && entries.length ? entries.map(entriesMap) : <TableRow  entry={{id: "-----", nome: "No", idade: "Entry", peso: "-----"}} ></TableRow>}
            </tbody>
        </table>
    </div>
  )
}
