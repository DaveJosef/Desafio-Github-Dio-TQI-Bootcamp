import React from 'react';

/* export default function Form({ submitAction }) {
    const [entry, setEntry] = useState();

  return (
    <form action="" onSubmit={(e) => {console.log(entry); e.preventDefault()}}>
        <label>Nome: 
        <input value={entry.name} type="text" name="nome" id="nome" onChange={(e) => setEntry({ [e.target.name]: e.target.value })} /></label>
        <label>Idade: 
        <input value={entry.idade} type="number" name="idade" id="idade" onChange={(e) => setEntry({ [e.target.name]: e.target.value })} /></label>
        <label>Peso: 
        <input value={entry.peso} type="number" name="peso" id="peso" onChange={(e) => setEntry({ [e.target.name]: e.target.value })} /></label>

        <input type="submit" value="Add" />
    </form>
  )
} */

export default class Form extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            nome: "",
            idade: 0,
            peso: 0
        };

        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleInputChange(event) {
        const target = event.target;
        const value = target.type === 'checkbox' ? target.checked : target.value;
        const name = target.name;

        this.setState({ [name]: value });
    }

    handleSubmit(event) {
        const { nome, idade, peso } = this.state;
        alert(`${nome}, ${idade}, ${peso}`);
        event.preventDefault();
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit} style={{display: 'flex', flexDirection: 'column'}}>
                <label>Nome: 
                <input value={this.state.name} type="text" name="nome" id="nome" onChange={this.handleInputChange} /></label>
                <label>Idade: 
                <input value={this.state.idade} type="number" name="idade" id="idade" onChange={this.handleInputChange} /></label>
                <label>Peso: 
                <input value={this.state.peso} type="number" name="peso" id="peso" onChange={this.handleInputChange} /></label>
        
                <input type="submit" value="Add" />
            </form>
        )
    }
}
