import React from 'react';
import ReactDOM from 'react-dom';

class Portal extends React.Component {
    public state = {counter: 0}

    increase() {
        this.setState((prevState: any) => ({
            counter: prevState.counter + 1
        }))
    }

    render() {
        return (
            <div id="father" onClick={this.increase.bind(this)}>
                <div>counter:{this.state.counter}</div>
                {/*<button>Click</button>*/}
                {ReactDOM.createPortal(<button>Click</button>, document.getElementById('portal') as HTMLElement)}
            </div>
        );
    }
}

export default Portal;